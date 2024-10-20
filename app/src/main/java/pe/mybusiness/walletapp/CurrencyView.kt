package pe.mybusiness.walletapp

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AccountBox
import androidx.compose.material.icons.rounded.AccountCircle
import androidx.compose.material.icons.rounded.AddCircle
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import pe.mybusiness.walletapp.data.Currency
import pe.mybusiness.walletapp.ui.theme.GreenStart
import androidx.compose.material.icons.rounded.AttachMoney
import androidx.compose.material.icons.rounded.CurrencyYen
import androidx.compose.material.icons.rounded.Euro
@Preview(showBackground = true)
@Composable
fun CurrencyItem(index: Int = 0, width: Dp = 20.dp) {
    val currency = currencies[index]
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Row(
            modifier = Modifier
                .width(width),
            verticalAlignment = Alignment.CenterVertically
        )
        {
            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(16.dp))
                    .background(GreenStart)
                    .padding(4.dp)
            )
            {
                Icon(
                    modifier = Modifier.size(18.dp),
                    imageVector = currency.icon,
                    tint = Color.White,
                    contentDescription = currency.name
                )
            }
            Text(
                text = currency.name,
                modifier = Modifier
                    .padding(10.dp),
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.onBackground
            )

        }
    }
}

val currencies = listOf(
    Currency(name = "USD", buy = 3.82f, sell = 3.94f, icon = Icons.Rounded.AttachMoney),
    Currency(name = "EUR", buy = 4.72f, sell = 5.84f, icon = Icons.Rounded.Euro),
    Currency(name = "YEN", buy = 3.82f, sell = 3.94f, icon = Icons.Rounded.CurrencyYen)
)