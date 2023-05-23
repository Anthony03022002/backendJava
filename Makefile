build-image:
	@ docker build -f devops/Dockerfile -t backendjava:1 .
volume:
	@ docker volume create pg_integrador3_data
deploy:
	@ docker stack deploy --with-registry-auth -c devops/stack.yml backendjava
rm:
	@ docker stack rm backendjava