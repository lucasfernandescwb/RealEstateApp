package xyz.mananeko.project252.ui.theme.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import xyz.mananeko.project252.R

@Composable
fun CategoriesRow() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 16.dp),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        CategoryItem(icon = R.drawable.cat_1, title = "House", Modifier.weight(1f))
        CategoryItem(icon = R.drawable.cat_2, title = "Apartment", Modifier.weight(1f))
        CategoryItem(icon = R.drawable.cat_3, title = "Villa", Modifier.weight(1f))
        CategoryItem(icon = R.drawable.cat_4, title = "Bangola", Modifier.weight(1f))
        CategoryItem(icon = R.drawable.cat_5, title = "Empty land", Modifier.weight(1f))
    }
}