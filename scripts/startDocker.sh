#!/bin/bash

echo "start docker"

sudo systemctl start docker
systemctl status docker
sudo usermod -a -G docker $USER

echo "docker running ..."