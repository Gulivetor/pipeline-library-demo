#!/usr/bin/env groovy

def call(String repo_name = 'jenkinsfiles') {
    echo "Now cloning repo: ${repo_name}."
    echo 'Branch name : ' + BRANCH
    echo 'URL : ' + SSH_URL
    git branch: BRANCH, credentialsId: 'jenkins-github', url: SSH_URL
    build job: "simple-node-js-react-npm-app"
}