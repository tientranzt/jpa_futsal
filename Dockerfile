FROM airhacks/glassfish
COPY ./target/tournements-futsal.war ${DEPLOYMENT_DIR}
