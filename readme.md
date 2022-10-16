# Commands needed for this demo:

docker login

docker build -t docker-demo .

docker tag docker-demo mpoots/docker-demo
docker push mpoots/docker-demo

# remove local:

docker rmi docker-demo mpoots/docker-demo

# pull image from docker hub and run it with port mapped to 8080:

docker run -p 8080:8080 mpoots/docker-demo

# get images:

docker ps

# use image:

docker stop <image>

Now with Kubernetes

##### start Minikube and check status
    minikube start --vm-driver=hyperkit 
    minikube status

# tunnel only on Windows
    minikube tunnel 

# Deploy our container from Docker-hub via deployment config:
kubectl apply -f C:\Users\HP\IdeaProjects\demo-service\demo-docker-deployment.yaml

# Retrieve exposed IP to access service:
minikube service webapp-service --url