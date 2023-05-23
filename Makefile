build-image:
	@ docker build -f devops/Dockerfile -t backendjava:1 .
volume:
	@ docker volume create integrador3
deploy:
	@ docker stack deploy --with-registry-auth -c devops/stack.yml integrador3
rm:
	@ docker stack rm integrador3