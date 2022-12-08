// Copyright 2000-2021 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import compose.ComposeApp
import helpers.Strings

/**
 * "Главная" функция приложения, отрисовывающая всё.
 */
@Composable
@Preview
fun App() {
    ComposeApp.MainApp()
}

/**
 * Главная функция приложения.
 */
fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = Strings.APP_NAME,
        icon = painterResource("logo.png")
    ) {
        App()
    }
}
