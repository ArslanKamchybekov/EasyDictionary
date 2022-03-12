package kg.geektech.easydictionary.feature_dictionary.domain.repository

import kg.geektech.easydictionary.core.util.Resource
import kg.geektech.easydictionary.feature_dictionary.domain.model.WordInfo
import kotlinx.coroutines.flow.Flow

interface WordInfoRepository {

    fun getWordInfo(word: String): Flow<Resource<List<WordInfo>>>
}