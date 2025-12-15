// ARQUIVO: settings.gradle.kts

pluginManagement {
    repositories {
        // Estes você já tem
        google()
        mavenCentral()
        // ESTA LINHA VAI RESOLVER O ERRO 'Plugin not found'
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "GuiaPocket"
include(":app")
