package com.github.speak2me.ksp.uistate

import com.github.speak2me.ksp.uistate.annotations.DataModel
import com.github.speak2me.ksp.uistate.annotations.Sealed

@Sealed(
  models = [
    DataModel(type = User::class)
  ]
)
sealed interface UiState {

  data object Loading : UiState

  data class Error(val message: String) : UiState

  data class Success<T>(val data: T) : UiState

}
