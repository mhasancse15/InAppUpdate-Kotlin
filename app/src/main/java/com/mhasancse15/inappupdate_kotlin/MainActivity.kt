package com.mhasancse15.inappupdate_kotlin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.IntentSenderRequest
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.mhasancse15.inappupdate_kotlin.ui.theme.InAppUpdateKotlinLibTheme

class MainActivity : ComponentActivity() {
    private lateinit var activityResultLauncher: ActivityResultLauncher<IntentSenderRequest>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //USING In App Update Library
        activityResultLauncher = registerForActivityResult(ActivityResultContracts.StartIntentSenderForResult()) { result ->
            // Handle the result of the update flow here
        }
        InAppUpdateManager.init(this, activityResultLauncher)
        setContent {
            InAppUpdateKotlinLibTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    HelloOpenSource()
                }
            }
        }
    }
}

@Composable
fun HelloOpenSource(modifier: Modifier = Modifier) {
    Text(
        text = "Hello Open Source!",
        modifier = modifier
    )
}

