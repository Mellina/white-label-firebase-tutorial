package br.com.douglasmotta.whitelabeltutorial.domain.usecase

import android.net.Uri

interface CreateProductUseCase {

    suspend operator fun invoke(description: String, price: Double, imageUri: Uri): String
}