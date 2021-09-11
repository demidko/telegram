# Telegram bot template

## Usage

1. Make sure you are signed in to your GitHub account, then just
   click [`here`](https://github.com/demidko/telegram/generate) to use template.
2. See [Kotlin Telegram bot guide](https://github.com/kotlin-telegram-bot/kotlin-telegram-bot).
   `App.kt` file is entry point.

## Build with Java

Execute `./gradlew clean build`. Your jar will be located at `./build/libs` with `-all.jar` postfix.
Now you can run:

```shell
TOKEN=... java -jar telegram-all.jar
```

## Or, build with Docker

Execute `docker build . -t telegram`. Your image will be located at `docker images -a`. Now you can
run:

```shell
docker run -it --rm --env TOKEN=... telegram
```

## Deploy

[![Deploy to DigitalOcean](https://www.deploytodo.com/do-btn-blue-ghost.svg)](https://cloud.digitalocean.com/apps/new?repo=https://github.com/YOUR/REPO/tree/main)