# Basic Sound Sample

A minimal JVM application demonstrating how to play audio with the `basic-sound` library.

## Running

1. Build the library jar:
   ```
   ./gradlew :basic-sound:jvmJar
   ```
2. Run the sample, providing an audio file path or URL. If omitted, you'll be prompted at runtime:
   ```
   ./gradlew -p sample run --args="<audio-path-or-url>"
   ```
   or
   ```
   ./gradlew -p sample run
   Enter audio resource (file path or URL): /path/to/audio.mp3
   ```

The program plays the sound and waits for you to press **ENTER** before releasing resources.
