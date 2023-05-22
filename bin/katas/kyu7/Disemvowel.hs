module Disemvowel where

disemvowel :: String -> String
disemvowel = filter (`notElem` vowels)
  where
    vowels = "aoueiAOUEI"