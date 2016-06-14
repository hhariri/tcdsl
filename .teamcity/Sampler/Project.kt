package Sampler

import Sampler.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v0.*

object Project : KProject({
    uuid = "fcee6077-3116-4e01-991f-17cc687cb552"
    extId = "Sampler"
    parentId = "_Root"
    name = "Sampler"

    buildType(Sampler_SampleBuild)

    features {
        feature {
            type = "versionedSettings"
            param("rootId", "GitGithubComHhaririTcdslGit")
            param("format", "kotlin")
            param("showChanges", "true")
            param("buildSettings", "PREFER_VCS")
            param("enabled", "true")
        }
    }
})
