plugins {
    id("net.morthen.gradle.multiloader")
}

multiloader {
    loader = "fabric"

    fabricApiVersion = providers.gradleProperty("fabric_api")
    fabricLoaderVersion = providers.gradleProperty("fabric_loader")

    withModPublish {
        server = false
        required.set(listOf(
            "fabric-api"
        ))
    }

    applyMetadataReplacements(listOf("pack.mcmeta", "*.mixins.json", "fabric.mod.json"), mapOf(
        "fabric_api" to fabricApiVersion.get(),
        "fabric_loader" to fabricLoaderVersion.get(),
        "sources_url" to providers.gradleProperty("sources_url").get(),
        "issues_url" to providers.gradleProperty("issues_url").get()
    ))
}

dependencies {
    implementation("com.terraformersmc:modmenu:21.0.0-beta.1")
    compileOnly("maven.modrinth:iris:1.11.6+26.3-fabric")
}