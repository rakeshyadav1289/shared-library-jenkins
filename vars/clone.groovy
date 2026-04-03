def call(string branch, string  url)
{
  echo "git clonning"
  git branch: "${branch}", url: "${url}"
  echo 'git cloning successfull'
}
