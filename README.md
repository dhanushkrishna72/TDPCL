# Verifi
Trans Disciplinary Project Centric Learning (TDPCL)

## Abstract

Verifi is a Trans Disciplinary Project Centric Learning (TDPCL) project focused on addressing the problem of digital misinformation. The objective of this project is to build a system that can detect fake news in real time and identify morphed or manipulated images using a combination of web technologies, natural language processing, and computer vision.

The project is developed as a team-based academic initiative with an emphasis on modular system design, controlled collaboration, and industry-aligned version control practices. Each module is developed independently and integrated only after proper review to ensure stability and code quality.

## Project Objectives

- Build a live fake news detection system
- Detect morphed and manipulated images
- Develop a web-based news aggregation platform
- Apply trans disciplinary engineering concepts
- Follow structured and secure Git-based collaboration

## Project Structure

Verifi/
├── news-app/  
├── fake-news-detector/  
├── morphed-image-detector/  
├── docs/  
└── README.md  

## Development Workflow

This repository follows a strict branch-based workflow. Direct commits to protected branches are not allowed.

Protected branches:
- main: Stable and final code
- develop: Integration branch

Only the project coordinator is allowed to merge changes into these branches.

## Rules for Team Members

- Do not commit directly to main or develop
- Work only inside your assigned module directory
- Always create a feature branch before coding
- All changes must be submitted via Pull Request
- Code will be merged only after review

## How to Use This Repository

`` Step 1: Clone the repository

git clone https://github.com/dhanushkrishna72/TDPCL.git
cd TDPCL  

Step 2: Switch to develop branch

git checkout develop  
git pull origin develop  

Step 3: Create your feature branch

git checkout -b feature/<your-module-name>  

Example:
feature/fake-news-detector  
feature/morphed-image-detector  

Step 4: Work on your assigned module only

Fake news module: fake-news-detector/  
Morph image module: morphed-image-detector/  
News app module: news-app/  

Do not modify files outside your assigned directory.

Step 5: Commit your changes

git status  
git add .  
git commit -m "Implemented initial logic for <module-name>"  

Step 6: Push your "branch"

git push origin feature/<your-module-name>  

Step 7: Create a Pull Request

- Base branch: develop
- Compare branch: your feature branch
- Clearly explain what you implemented

Wait for approval before merging.``

## Technology Stack

- React for web-based news application
- News APIs and RSS feeds for live news
- Natural Language Processing for fake news detection
- Computer Vision for morphed image detection
- Git and GitHub for version control

## Learning Outcomes

- Real-world software architecture understanding
- Exposure to misinformation detection techniques
- Experience with team-based Git workflows
- Trans disciplinary problem-solving skills

## Maintainer

Project Coordinator
Dr. Gowthul Alam
Dr. Raghu N
Verifi TDPCL Project Team Mates
Dhanush K
Ayush Patel
Vivek Yadav
Envoe Binsubair

All final merge decisions are made by the coordinator.
