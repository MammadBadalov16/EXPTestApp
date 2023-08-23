package az.mb.exbtestapp.di

import az.mb.exbtestapp.data.repository.CategoryRepositoryImpl
import az.mb.exbtestapp.domain.repository.CategoryRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {


    @Provides
    @Singleton
    fun provideCoinRepository(): CategoryRepository {
        return CategoryRepositoryImpl()
    }
}