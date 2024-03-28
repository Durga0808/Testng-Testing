pipeline {
    agent any
    
    tools{
       jdk 'jdk17'
       maven 'maven3'
    }

    stages {
        stage('Git Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/Durga0808/Testng-Testing.git'
            }
        }
        
        stage('COMPILE'){
            steps{
                sh "mvn clean"
            }
        }
        
        stage('Test'){
            steps{
                sh "mvn test"
            }
        }
    }
}
