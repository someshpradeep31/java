pipeline {
    agent any
    
    stages {
        stage('Build') {
            steps {
                sh 'javac demo.java'
                sh'java Reverse'
            }
        }
        stage('Test') {
            steps {
                sh 'javac concat.java'
                sh 'java JavaConcat'
            }
        }
    }   
}
