# Basic Sound Sample

A minimal JVM application demonstrating how to play audio with the `basic-sound` library.

This project uses a Gradle [composite build](https://docs.gradle.org/current/userguide/composite_builds.html) to substitute the published dependency with the local source code from the parent directory. Any changes you make to the library are picked up automatically.

## Running

Run the sample, optionally providing an audio file path or URL. If omitted, you'll be prompted at runtime:

```
./gradlew -p sample run --args="<audio-path-or-url>"
```

or

```
./gradlew -p sample run
Enter audio resource (file path or URL): /path/to/audio.mp3
```

The program plays the sound and waits for you to press **ENTER** before releasing resources.
