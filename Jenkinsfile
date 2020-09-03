pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        echo 'Building...'
      }
    }

    stage('Test') {
      parallel {
        stage('Test Chrome') {
          steps {
            sh 'echo \'Testing in Chrome...\''
          }
        }

        stage('Test Firefox') {
          steps {
            sh 'echo \'Testing in Firefox...\''
          }
        }

        stage('Test Edge') {
          steps {
            sh 'echo \'Testing in Edge...\''
          }
        }

      }
    }

    stage('Deploy') {
      steps {
        echo 'Deploying...'
      }
    }

  }
}