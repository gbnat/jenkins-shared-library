@Library("shared-library-gbnat") _
pipeline {
    agent any
    stages{
        stage('Example') {
            steps {
                echo 'Hello Planet Win!'
                script{
                    helloPlanetwin(dayOfweek: "Sunday", name: "Gil")    
                }
                
            }
        }
    }
}
