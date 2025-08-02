package com.anna.myportfolio.presentation.screen.contacts

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.anna.myportfolio.presentation.sampleContact

@Composable
fun ScreenContacts(
    contact: Contacts,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = Modifier
            .size(
                width = 280.dp,
                height = 400.dp,
            )
            .padding(8.dp)
            .background(Color.Red),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceAround
    )
    {
        Text(text = contact.name,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.Cursive)
        Text(text = contact.profession,
            fontWeight = FontWeight.Bold,
            )
        Spacer(modifier = Modifier.height(8.dp))

        ContactItem(title = "Phone", value = contact.phoneNumber)
        ContactItem(title = "Email", value = contact.email)
        ContactItem(title = "Address", value = contact.address)
        ContactItem(title = "Telegram", value = contact.telegram)
        ContactItem(title = "Vkontakte", value = contact.vkontakte)
        ContactItem(title = "GitHub", value = contact.github)
        ContactItem(title = "LinkedLn", value = contact.linkedLn)
    }
}

@Preview(showBackground = true,
)
@Composable
fun ScreenContactsPreview() {

    ScreenContacts(contact = sampleContact)
}
