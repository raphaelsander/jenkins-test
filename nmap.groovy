pipeline {
    agent {
        label 'docker-agent'
    }
    
    stages {
        stage('Run Nmap') {
            steps {
                script {
                    echo 'Hello World'
                }
            }
        }
    }
}
