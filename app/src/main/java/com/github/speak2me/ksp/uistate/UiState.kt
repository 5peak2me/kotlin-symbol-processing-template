package com.github.speak2me.ksp.uistate

import com.github.speak2me.ksp.template.Template

@Template
sealed interface UiState {

  data object Loading : UiState

  data class Error(val message: String) : UiState

  data class Success<T>(val data: T) : UiState

}
