dependencies {
    // server
    compileOnly("dev.folia:folia-api:1.20.1-R0.1-SNAPSHOT")

    // command
    compileOnly("dev.jorel:commandapi-bukkit-core:9.3.0")

    // packet
    compileOnly("com.comphenix.protocol:ProtocolLib:5.2.0-SNAPSHOT")

    // papi
    compileOnly("me.clip:placeholderapi:2.11.5")

    // config
    compileOnly("dev.dejvokep:boosted-yaml:1.3.1")

    // team
    compileOnly("me.neznamy:tab-api:4.0.2")
    compileOnly(files("libs/CMI-API-9.6.5.0.jar"))

    // Gson
    compileOnly("com.google.code.gson:gson:2.10.1")

    // database
    compileOnly("org.xerial:sqlite-jdbc:3.43.0.0")
    compileOnly("com.h2database:h2:2.2.224")
    compileOnly("org.mongodb:mongodb-driver-sync:4.11.1")
    compileOnly("com.zaxxer:HikariCP:5.0.1")
    compileOnly("redis.clients:jedis:5.1.0")

    // others
    compileOnly("com.github.LoneDev6:api-itemsadder:3.5.0c-r5")
    compileOnly("io.th0rgal:oraxen:1.165.0")
    compileOnly("com.github.FrancoBM12:API-MagicCosmetics:2.2.5")
    compileOnly("commons-io:commons-io:2.15.1")


    // chat channels
    compileOnly(files("libs/VentureChat-3.7.1.jar"))
    compileOnly(files("libs/TrChat-2.0.11.jar"))

    // api module
    implementation(project(":api"))
    implementation(project(":common"))

    // adventure
    implementation("net.kyori:adventure-api:4.15.0")
    implementation("net.kyori:adventure-platform-bukkit:4.3.2")
    implementation("net.kyori:adventure-text-minimessage:4.15.0")
    implementation("net.kyori:adventure-text-serializer-legacy:4.15.0")
	
    // bStats
    implementation("org.bstats:bstats-bukkit:3.0.2")

    // local lib
    implementation(files("libs/BiomeAPI.jar"))
}

tasks {
    shadowJar {
        relocate ("net.kyori", "net.momirealms.customnameplates.libraries")
        relocate ("org.bstats", "net.momirealms.customnameplates.libraries.bstats")
        relocate ("net.momirealms.biomeapi", "net.momirealms.customnameplates.libraries.biomeapi")
    }
}
