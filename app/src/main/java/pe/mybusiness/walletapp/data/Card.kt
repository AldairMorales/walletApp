package pe.mybusiness.walletapp.data

import androidx.compose.ui.graphics.Brush

data class Card(
    val cardType: String,
    var cardNumber: String,
    var cardName: String,
    var balance: Double,
    var color: Brush,
)

data class Card2(
    val cardType: String = "",
    var cardNumber: String = "",
    var cardName: String = "",
    var balance: String = "",
    var color: String = "",
)