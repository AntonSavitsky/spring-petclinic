pipelineJob('pipeline') {
    definition {
        cpsScm {
            scm {
                github('AntonSavitsky/spring-petclinic')
            }
            scriptPath('Jenkinsfile')
        }
    }
}