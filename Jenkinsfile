pipeline {
         agent any
         stages {
                 stage('One') {
                 steps {
                     echo 'Hi,I am Somesh Pradeep'
                 }
                 }
                 stage('Two') {
                 steps {
                    input('Do you want to proceed?')
                 }
                 }
                 stage('Three') {
                 
                 steps {
                      sh 'javac Demo.java'
                     sh  'java Main'
                 }
                 }
                 
                 
                            stage('Four') {
                           steps {
                                sh 'javac concat.java'
                                sh  'java JavaConcat'
                           }
                           }
                            stage('Five') {
                              
                              steps {
                                echo "Deploying the project"
                              }
                           }
                           
                           
              }
}
