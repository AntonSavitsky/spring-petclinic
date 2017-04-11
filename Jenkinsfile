node {
            stage "Checkout & Prepare"
            checkout scm
            sh "printenv"

            stage "Install"
            def mvnHome = tool 'maven-3'
            sh "${mvnHome}/bin/mvn clean install"
}
