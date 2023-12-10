pipeline {
    agent {
        label 'kali'
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
