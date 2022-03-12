package kg.geektech.easydictionary.feature_dictionary.presentation

import kg.geektech.easydictionary.feature_dictionary.domain.model.WordInfo

data class WordInfoState(
    val wordInfoItems: List<WordInfo> = emptyList(),
    val isLoading: Boolean = false
)