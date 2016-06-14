package Sampler.buildTypes

import jetbrains.buildServer.configs.kotlin.v0.*

object Sampler_SampleBuild : KBuildType({
    uuid = "17dd9679-f911-44f8-b9b8-d9c2f503956f"
    extId = "Sampler_SampleBuild"
    name = "SampleBuild"

    options {
        executionTimeoutMin = 22
    }

    steps {
        step {
            type = "Maven2"
            param("goals", "clean test")
            param("mavenSelection", "mavenSelection:bundledM3_0")
        }
        step {
            name = "Execute Console"
            type = "simpleRunner"
            param("script.content", "Some Script")
        }
        step {
            type = "Duplicator"
            param("iprInfoRunParam", """<iprInfo path-to-ipr="" should-load-iml="true" should-load-run-configurations="false" should-load-artifacts="false" />""")
        }
        step {
            type = "NUnit"
            param("dotNetCoverage.NCover.HTMLReport.File.Sort", "0")
            param("dotNetCoverage.NCover.HTMLReport.File.Type", "1")
            param("dotNetCoverage.NCover.Reg", "selected")
            param("dotNetCoverage.NCover.platformBitness", "x86")
            param("dotNetCoverage.NCover.platformVersion", "v2.0")
            param("dotNetCoverage.NCover3.Reg", "selected")
            param("dotNetCoverage.NCover3.platformBitness", "x86")
            param("dotNetCoverage.NCover3.platformVersion", "v2.0")
            param("dotNetCoverage.PartCover.Reg", "selected")
            param("dotNetCoverage.PartCover.platformBitness", "x86")
            param("dotNetCoverage.PartCover.platformVersion", "v2.0")
            param("dotNetTestRunner.Type", "NUnit")
            param("nunit_enabled", "checked")
            param("nunit_include", "dsdsds sd sd s")
            param("nunit_path", "ddsdsds")
        }
    }

    vcs {
        entry("GitGithubComHhaririJodaTimeGit")
    }

    features {
        feature {
            type = "BuildFailureOnMetric"
            param("anchorBuild", "lastSuccessful")
            param("metricKey", "VisibleArtifactsSize")
            param("metricUnits", "metricUnitsDefault")
            param("moreOrLess", "more")
            param("withBuildAnchor", "false")
        }
        feature {
            type = "JetBrains.FileContentReplacer"
            param("teamcity.file.content.replacer.pattern", "dsdsds")
            param("teamcity.file.content.replacer.replacement", "dsdsdsdsdsds")
            param("teamcity.file.content.replacer.wildcards", "fddfdfdfd")
        }
    }
})
