# Shared Hardcore (Fabric)

Un petit mod Fabric serveur qui passe tous les joueurs en mode Spectateur lorsqu'un joueur meurt.

- Implantation principale : [`com.example.sharedhardcore.SharedHardcoreMod`](src/main/java/com/example/sharedhardcore/SharedHardcoreMod.java) — écoute l'événement de mort et change le GameMode de tous les joueurs.
- Métadonnées du mod : [src/main/resources/fabric.mod.json](src/main/resources/fabric.mod.json)

Prérequis
- Java 21 (le projet utilise le toolchain Java défini dans [build.gradle](build.gradle)).
- Gradle (le wrapper est inclus, utilisez le wrapper fourni).

Fichiers importants
- Code source : [src/main/java/com/example/sharedhardcore/SharedHardcoreMod.java](src/main/java/com/example/sharedhardcore/SharedHardcoreMod.java)  
- Manifest Fabric : [src/main/resources/fabric.mod.json](src/main/resources/fabric.mod.json)  
- Build : [build.gradle](build.gradle)  
- Versions et propriétés : [gradle.properties](gradle.properties)  
- Configuration du wrapper : [gradle/wrapper/gradle-wrapper.properties](gradle/wrapper/gradle-wrapper.properties)  
- Wrappers exécutables : [gradlew](gradlew) et [gradlew.bat](gradlew.bat)  
- CI : [.github/workflows/build.yml](.github/workflows/build.yml)  
- Licence : [LICENSE](LICENSE)  
- Ignorés par git : [.gitignore](.gitignore)

Compiler et construire
- Unix / macOS :
  ./gradlew build
- Windows :
  gradlew.bat build

CI
- Une action GitHub est configurée pour construire le projet sur push et pull request : [.github/workflows/build.yml](.github/workflows/build.yml)

Contribuer
- Ouvrez une pull request. Le workflow CI construit automatiquement le projet.

Licence
- Ce projet est distribué sous CC0 (voir [LICENSE](LICENSE)).# Fabric Example Mod

## Setup

For setup instructions please see the [fabric documentation page](https://docs.fabricmc.net/develop/getting-started/setting-up-a-development-environment) that relates to the IDE that you are using.

## License

This template is available under the CC0 license. Feel free to learn from it and incorporate it in your own projects.
