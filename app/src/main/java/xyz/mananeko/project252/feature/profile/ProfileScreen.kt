package xyz.mananeko.project252.feature.profile

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import xyz.mananeko.project252.R
import xyz.mananeko.project252.ui.theme.components.OptionRow
import xyz.mananeko.project252.ui.theme.components.TopBar

@Composable
fun ProfileScreen(
    navController: NavController
) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(R.color.lightGrey)),
        contentPadding = PaddingValues(10.dp)
    ) {
        item { TopBar(onBack = { navController.navigateUp() }) }
        item { Spacer(Modifier.height(16.dp)) }
        item {
            Box(
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(R.drawable.profile),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .padding(horizontal = 16.dp)
                        .size(100.dp)
                        .height(220.dp)
                        .clip(RoundedCornerShape(30.dp))
                )
            }
        }
        item { Spacer(Modifier.height(16.dp)) }
        item {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxWidth(),
            ) {
                Text(
                    "Sara Anderson",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = colorResource(R.color.black)
                )

                Spacer(Modifier.height(4.dp))

                Text(
                    "+12 0123456789",
                    fontSize = 16.sp,
                    color = colorResource(R.color.black)
                )
                Text(
                    "saraanderson@gmail.com",
                    fontSize = 16.sp,
                    color = colorResource(R.color.black)
                )
            }
        }
        item { Spacer(Modifier.height(24.dp)) }
        item { OptionRow(title = "Account Info") }
        item { OptionRow(title = "Security") }
        item { OptionRow(title = "Notification") }
        item { OptionRow(title = "Language") }
        item { OptionRow(title = "Team & Condition") }
        item { OptionRow(title = "Privacy Policy") }
        item { Spacer(Modifier.height(8.dp)) }
    }
}