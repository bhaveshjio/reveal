package com.reveal.demo

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.reveal.demo.ui.theme.RevealTheme
import com.svenjacobs.reveal.RevealCanvas
import com.svenjacobs.reveal.rememberRevealCanvasState

@Composable
fun App(modifier: Modifier = Modifier) {
	RevealTheme {
		val revealCanvasState = rememberRevealCanvasState()

		RevealCanvas(
			revealCanvasState = revealCanvasState,
			modifier = modifier,
		) {
			MainScreen(revealCanvasState = revealCanvasState)
		}
	}
}
