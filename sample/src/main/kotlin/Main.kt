import app.lexilabs.basic.sound.Audio

fun main(args: Array<String>) {
    val resource = if (args.isNotEmpty()) {
        args[0]
    } else {
        print("Enter audio resource (file path or URL): ")
        readln().trim()
    }

    val audio = Audio(resource, autoPlay = true)
    println("Playing '$resource'. Press ENTER to stop.")
    readln()
    audio.release()
}
