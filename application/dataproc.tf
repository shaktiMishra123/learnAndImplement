terraform {
  backend "gcs" {
    bucket  = "aetna-devops-terraform-state"
    prefix  = "dataproc"
  }

  required_version = ">= 0.12"
}
provider "google-beta" {
  project = "aetna-gcp-devops"
  region  = "europe-west3"
  zone = "europe-west3-c"
}

module "my_foo_cluster" {
  source = "../terraform/modules/dataproc"
  cluster_name = "my-cool-cluster"
  cluster_version = "1.4"
  region = "us-central1"
  master_ha = false
  zone = "us-central1-c"
  master_instance_type = "n1-standard-4"
  network = "my-cool-network"
  worker_instance_type = "n1-standard-4"
  conda_packages = "pandas=0.23.4 scikit-learn=0.20.0 pytest=3.8.0 pyyaml=3.13"
  pip_packages = "gensim==3.7.1 logdecorator==2.1"
  staging_bucket = "aetna-gcp-terraform-staging"
}