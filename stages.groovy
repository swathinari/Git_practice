// it's a dummy groovy script for adding the stages for jenkin pipe
pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building the project...'
                // Add your build commands here (e.g., mvn clean install, npm install)
            }
        }

        stage('Test') {
            steps {
                echo 'Running tests...'
                // Add your test commands here (e.g., mvn test, npm test)
            }
        }

        stage('Deploy') {
            steps {
                echo 'Deploying the project...'
                // Add your deploy commands here (e.g., kubectl apply, scp, etc.)
            }
        }
    }
}       
