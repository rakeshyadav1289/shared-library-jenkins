def call(branch, url)
{
  echo "git clonning"
  git branch: "${branch}", url: "${url}"
  echo 'git cloning successfull'
}
