import java.net.URL

tasks.register("test") {
    inputs.property("input", URL("https://example.com").apply {
        if (System.getenv("CALL_HASHCODE") != null) {
            hashCode()
        }
    })

    outputs.file("build/output.txt")
    doLast {
        outputs.files.singleFile.writeText(inputs.properties.get("input").toString())
    }
}