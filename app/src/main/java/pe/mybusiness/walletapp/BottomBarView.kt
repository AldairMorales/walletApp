package pe.mybusiness.walletapp

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AccountCircle
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.Notifications
import androidx.compose.material.icons.rounded.Warning
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import pe.mybusiness.walletapp.data.BottomNavigation

@Preview(showBackground = true)
@Composable
fun BottomBarView() {
    NavigationBar {
        Row(
            modifier = Modifier
                .background(MaterialTheme.colorScheme.inverseOnSurface)
        ) {
            bottomNavigationItems.forEachIndexed { index, item ->
                NavigationBarItem(
                    selected = index == 0,
                    onClick = { /*TODO*/ },
                    icon = {
                        androidx.compose.material3.Icon(
                            imageVector = item.icon,
                            contentDescription = item.title,
                            tint = MaterialTheme.colorScheme.onBackground
                        )
                    },
                    label = {
                        Text(
                            text = item.title,
                            color = MaterialTheme.colorScheme.onBackground
                        )
                    })
            }
        }
    }
}

var bottomNavigationItems = listOf(
    BottomNavigation(title = "Home", icon = Icons.Rounded.Home),
    BottomNavigation(title = "Wallet", icon = Icons.Rounded.Warning),
    BottomNavigation(title = "Notification", icon = Icons.Rounded.Notifications),
    BottomNavigation(title = "Account", icon = Icons.Rounded.AccountCircle),
)