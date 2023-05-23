build-image:
	@ docker build -f devops/Dockerfile -t backendjava:1 .
volume:
	@ docker volume create integrador3_data
deploy:
	@ docker stack deploy --with-registry-auth -c devops/stack.yml backend
rm:
	@ docker stack rm backend