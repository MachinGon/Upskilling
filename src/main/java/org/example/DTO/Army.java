package org.example.DTO;

abstract class Army implements  Job{
    MilitaryRank myRank = null;
}

enum MilitaryRank{
    Cadet,
    Officer,
    Marshall,
    Commodore,
    General,
    Major,
    Captain
}
