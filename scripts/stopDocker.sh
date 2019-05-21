#!/bin/bash

echo "stop docker"

sudo systemctl stop docker
systemctl status docker

echo "docker stopped"