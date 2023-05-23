build-image:
	@ docker build -f devops/Dockerfile -t grupotresjava:1 .
volume:
	@ docker volume create pg_tendencias_grupo3
deploy:
	@ docker stack deploy --with-registry-auth -c devops/stack.yml grupo3
rm:
	@ docker stack rm grupo3