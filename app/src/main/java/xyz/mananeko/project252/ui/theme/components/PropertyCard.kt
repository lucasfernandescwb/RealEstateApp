package xyz.mananeko.project252.ui.theme.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import xyz.mananeko.project252.R
import xyz.mananeko.project252.core.Property
import xyz.mananeko.project252.util.getDrawableId

@Composable
fun PropertyCard(
    item: Property
) {
    val white = colorResource(R.color.white)
    val blue = colorResource(R.color.blue)
    val black = colorResource(R.color.black)
    val grey = colorResource(R.color.grey)

    Column(
        modifier = Modifier
            .padding(horizontal = 16.dp, vertical = 8.dp)
            .height(320.dp)
            .fillMaxWidth()
            .clip(RoundedCornerShape(30.dp))
            .background(white)
    ) {
        Box {
            Image(
                painter = painterResource(getDrawableId(item.pickPath)),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .background(white)
                    .height(233.dp)
                    .padding(12.dp)
                    .clip(RoundedCornerShape(30.dp)),
                contentScale = ContentScale.Crop
            )

            Text(
                text = "$${item.price}",
                color = colorResource(R.color.white),
                fontWeight = FontWeight.Bold,
                fontSize = 15.sp,
                modifier = Modifier
                    .padding(start = 28.dp, bottom = 28.dp)
                    .align(Alignment.BottomStart)
                    .clip(RoundedCornerShape(50.dp))
                    .background(blue)
                    .padding(horizontal = 16.dp, vertical = 6.dp)
            )
        }

        Column(
            modifier = Modifier
                .clip(RoundedCornerShape(30.dp))
                .padding(horizontal = 16.dp)
        ) {
            Spacer(Modifier.height(8.dp))
            Text(
                item.title,
                color = black,
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp
            )
            Text(
                item.address,
                color = grey,
                fontSize = 13.sp
            )
            Spacer(Modifier.height(8.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 12.dp),
                horizontalArrangement = Arrangement.Absolute.SpaceBetween
            ) {
                MetaChip(
                    icon = R.drawable.bed,
                    text = "${item.bed} Bed"
                )
                MetaChip(
                    icon = R.drawable.bath,
                    text = "${item.bath} Bath"
                )
                MetaChip(
                    icon = R.drawable.garage,
                    text = if(item.isGarage) "Car Garage" else "non-Car Garage"
                )
                MetaChip(
                    icon = R.drawable.size,
                    text = "${item.size} m2"
                )
            }
        }
    }
}

@Preview
@Composable
fun PropertyCardPreview() {
    val property = Property(
        type = "Apartment",
        title = "Luxury Apartment",
        address = "123 Main St, Anytown, USA",
        pickPath = "pic_1",
        price = 250000,
        bed = 2,
        bath = 2,
        size = 1200,
        isGarage = true,
        score = 4.5,
        description = "A beautiful and spacious luxury apartment."
    )
    PropertyCard(item = property)
}