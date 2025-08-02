package com.anna.myportfolio.presentation

import android.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.anna.myportfolio.presentation.screen.contacts.Contacts
import com.anna.myportfolio.presentation.screen.contacts.ScreenContacts
import com.anna.myportfolio.presentation.theme.MyPortfolioTheme
import com.anna.myportfolio.presentation.theme.Pink40

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyPortfolioTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ScreenContacts(
                        contact = sampleContact,
                        modifier = Modifier.padding(innerPadding)
                            .background(color = Pink40)
                    )
                }
            }
        }
    }
}

