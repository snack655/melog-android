pluginManagement {
    repositories {
        google()
        mavenCentral()
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
rootProject.name = "melog"
include(":app")
include(":di")
include(":meldown")
include(":database")
include(":network")
include(":domain")
include(":data")
include(":model")
include(":presentation")
