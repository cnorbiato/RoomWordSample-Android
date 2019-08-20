package br.com.norbiato.roomwordsample

import android.app.Application
import br.com.norbiato.roomwordsample.di.dbModule
import br.com.norbiato.roomwordsample.di.repositoryModule
import br.com.norbiato.roomwordsample.di.uiModule
import br.com.norbiato.roomwordsample.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MyApplication : Application() {
    override fun onCreate(){
        super.onCreate()

        // start Koin!
        startKoin {
            // declare used Android context
            androidContext(this@MyApplication)
            // declare modules
            modules(
                listOf(
                    viewModelModule,
                    uiModule,
                    dbModule,
                    repositoryModule
                )
            )
        }
    }
}