plugins {
    id("net.morthen.gradle.multiloader")
}

multiloader {
    neoFormVersion = providers.gradleProperty("neoform")
}

dependencies {
    compileOnly("org.spongepowered:mixin:0.8.5")
    compileOnly("org.ow2.asm:asm-tree:9.6")
    compileOnly("org.ow2.asm:asm:9.6")

    compileOnly("maven.modrinth:iris:1.11.2+26.2-neoforge")
}